package baidumap_test.weiyu.test.com.baidumap_test;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

import com.baidu.platform.comapi.map.C;

/**
 * Created by Administrator on 2016/10/16.
 */
public class MyOrientationListener implements SensorEventListener {
    private SensorManager mSensorManager;
    private Sensor mSensor;
    private Context mContext;
    private float lastX;

    public MyOrientationListener(Context context) {
        this.mContext = context;
    }

    public void start(){
        mSensorManager = (SensorManager) mContext.getSystemService(Context.SENSOR_SERVICE);
        if(mSensorManager!=null){
            //获得方向传感器
            mSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION);
        }
        if(mSensor!=null){
            mSensorManager.registerListener(this,mSensor,SensorManager.SENSOR_DELAY_UI);
        }
    }

    public void stop(){
        mSensorManager.unregisterListener(this);
    }
    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if(sensorEvent.sensor.getType()==Sensor.TYPE_ORIENTATION){
            float x = sensorEvent.values[SensorManager.DATA_X];
            if(Math.abs(x - lastX)>1.0){
                if(mOnOrientationListener!=null){
                    mOnOrientationListener.onOrientationChanged(x);
                }
            }
            lastX = x;
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    private OnOrientationListner mOnOrientationListener;

    public void setOnOrientationListener(OnOrientationListner mOnOrientationListener){
        this.mOnOrientationListener = mOnOrientationListener;
    }

    public interface OnOrientationListner{
        void onOrientationChanged(float x);
    }
}
