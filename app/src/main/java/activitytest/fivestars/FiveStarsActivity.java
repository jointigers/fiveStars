package activitytest.fivestars;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FiveStarsActivity extends Activity {
    private Button  noThanks;
    private Button  later;
    private TextView fiveStartPlay;
    private FrameLayout fiveStarRate;

//test
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.five_starts_activity_main);
        fiveStarRate = (FrameLayout) findViewById(R.id.fiveStarRate);

        later= (Button)findViewById(R.id.five_later);
        noThanks=(Button)findViewById(R.id.five_no_thanks);
        fiveStartPlay=(TextView)findViewById(R.id.five_start_play);
        later.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlphaAnimation alpha = new AlphaAnimation(1.0f, 0.0f);
                alpha.setDuration(Configure.MaybeLateAlphaAnimation);
                alpha.setFillAfter(true);
                fiveStarRate.startAnimation(alpha);
                alpha.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }
                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                    @Override
                    public void onAnimationEnd(Animation animation) {
                        fiveStarRate.clearAnimation();
                        fiveStarRate.setVisibility(View.GONE);
                    }
                });
                FiveStarTime.setFiveStarTime(getApplicationContext(),System.currentTimeMillis()+Configure.SP_may_belater);
            }
        });




    }
}
