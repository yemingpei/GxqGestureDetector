package com.gxq.test;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class TestView extends View {
	
	public TestView(Context context) {
		this(context, null);
	}

	public TestView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);

	}

	public TestView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		mScaleGestureDetector=new GxqGestureDetector(context,new ScaleGestureListener());
	}

	private GxqGestureDetector mScaleGestureDetector=null;
	
	public class ScaleGestureListener implements GxqGestureDetector.OnScaleGestureListener{

		@Override
		public boolean onScale(GxqGestureDetector detector) {
			Log.e("Level", "onScale");
			return false;
		}

		@Override
		public boolean onScaleBegin(GxqGestureDetector detector) {
			Log.e("Level", "onScaleBegin");
			return true;
		}

		@Override
		public void onScaleEnd(GxqGestureDetector detector) {
			Log.e("Level", "end");
			
		}

		@Override
		public void onScroll(float velocityX, float velocityY) {
			Log.e("Level", "onFling +x "+velocityX+" y "+velocityY);
			
		}

		@Override
		public void onLongPress() {
			Log.e("Level", "onLongPress");
			
		}
		
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		return mScaleGestureDetector.onTouchEvent(event);
	}

}
