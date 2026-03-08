package com.example.template;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // ======== הצהרת משתנים ========
    // שלב א: הצהרה על ארבעת המשתנים
    private EditText editTextName;
    private Button buttonWelcome;
    private Button buttonClear;
    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // מטפל ב-edge-to-edge (אל תמחק את הקוד הזה)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // ======== שלב ב: חיבור Views ========
        // מחברים את המשתנים לרכיבים שעיצבת במסך (לפי ה-ID שלהם)
        editTextName = findViewById(R.id.editTextName);
        buttonWelcome = findViewById(R.id.buttonWelcome);
        buttonClear = findViewById(R.id.buttonClear);
        textViewMessage = findViewById(R.id.textViewMessage);

        // ======== שלב ג: כפתור "ברוך הבא" ========
        // מגדירים מה יקרה בלחיצה על הכפתור
        buttonWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. קוראים את השם שהמשתמש הקליד
                String name = editTextName.getText().toString();
                // 2. בונים את הודעת הברכה
                String message = "שלום, " + name + "! ברוך הבא לאפליקציה!";
                // 3. מציגים את ההודעה על המסך
                textViewMessage.setText(message);
            }
        });

        // ======== שלב ד: כפתור "נקה" ========
        // מגדירים מה יקרה בלחיצה על כפתור הניקוי
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // מרוקנים את שדה הטקסט של הקלט
                editTextName.setText("");
                // מרוקנים את הודעת הברכה
                textViewMessage.setText("");
            }
        });
    }
}