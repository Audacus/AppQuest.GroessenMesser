package ch.fenceposts.appquest.groessenmesser.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

//View zum zeichnen der gr�nen Linie f�r �ber dem CameraPreview (SurfaceView)
public class CanvasGreenLineView extends View {
	public CanvasGreenLineView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	@Override
	// zeichne gr�ne Linie in der Mitte der View
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		Paint paint = new Paint();
		int middle = canvas.getHeight() / 2;
		
		paint.setColor(Color.GREEN);
		paint.setStrokeWidth(5.0f);
		canvas.drawLine(0, middle, canvas.getWidth(), middle, paint);
	}
}
