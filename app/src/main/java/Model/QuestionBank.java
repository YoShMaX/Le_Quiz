package Model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuestionBank {
    private List<Question> mQuestionList;
    private int mNextQuestionIndex;

    public QuestionBank(List<Question> questionList) {
        mQuestionList = questionList;

        // Mélanger la liste de questions
        Collections.shuffle(mQuestionList);

        mNextQuestionIndex = 0;
    }

    public Question getQuestion() {
        // S'assurer qu'on retourne à la première question une fois la dernière posée
        if (mNextQuestionIndex == mQuestionList.size()) {
            mNextQuestionIndex = 0;
        }

        // relancer l'incrémentation
        return mQuestionList.get(mNextQuestionIndex++);
    }



}
