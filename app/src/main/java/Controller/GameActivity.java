package Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lequizquifaitpeur.R;

public class GameActivity extends AppCompatActivity {

    //Déclaration des variables
    private TextView mQuestionText;
    private Button mAnswer1;
    private Button mAnswer2;
    private Button mAnswer3;
    private Button mAnswer4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        // Assignation de valeurs aux variables
        mQuestionText = (TextView) findViewById(R.id.activity_game_question_text);
        mAnswer1 = (Button) findViewById(R.id.activity_game_answer1_btn);
        mAnswer2 = (Button) findViewById(R.id.activity_game_answer2_btn);
        mAnswer3 = (Button) findViewById(R.id.activity_game_answer3_btn);
        mAnswer4 = (Button) findViewById(R.id.activity_game_answer4_btn);



    }
}