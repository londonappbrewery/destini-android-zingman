package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView Story;
    Button ansOne;
    Button ansTwo;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        Story = findViewById(R.id.storyTextView);
        ansOne = findViewById(R.id.buttonTop);
        ansTwo = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        ansOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    Story.setText(R.string.T3_Story);
                    ansOne.setText(R.string.T3_Ans1);
                    ansTwo.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }
                else if(mStoryIndex == 3){
                    Story.setText(R.string.T6_End);
                    ansOne.setVisibility(View.GONE);
                    ansTwo.setVisibility(View.GONE);
                    mStoryIndex = 6;
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        ansTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1) {
                    Story.setText(R.string.T2_Story);
                    ansOne.setText(R.string.T2_Ans1);
                    ansTwo.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                }
                else if(mStoryIndex == 2){
                    Story.setText(R.string.T4_End);
                    ansOne.setVisibility(View.GONE);
                    ansTwo.setVisibility(View.GONE);
                    mStoryIndex = 4 ;
                }
                else if(mStoryIndex ==  3){
                    Story.setText(R.string.T5_End);
                    ansOne.setVisibility(View.GONE);
                    ansTwo.setVisibility(View.GONE);
                }
            }
        });

    }
}
