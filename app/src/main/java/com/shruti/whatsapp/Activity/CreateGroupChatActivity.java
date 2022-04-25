package com.shruti.whatsapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.shruti.whatsapp.R;

public class CreateGroupChatActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private ImageButton SendMessageButton;
    private EditText userMessageInput;
    private ScrollView mScrollView;
    private TextView displayTextMessages;

    private String currentGroupName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_group_chat);

        getSupportActionBar().hide(); // Hide a Actionbar from Top in our app

        currentGroupName = getIntent().getExtras().get("Current Group Name").toString();
        Toast.makeText(CreateGroupChatActivity.this,currentGroupName,Toast.LENGTH_SHORT).show();


        //InitialiseFields();//Call Method
    }

//    private void InitialiseFields() {
//        mToolbar = findViewById(R.id.create_group_chat_bar_layout);
//        setSupportActionBar(mToolbar);
//        //getActionBar().setTitle("Group Name");
//        getSupportActionBar().setTitle(currentGroupName);
//
//        SendMessageButton = (ImageButton) findViewById(R.id.send_message_button);
//        userMessageInput = (EditText) findViewById(R.id.input_group_message);
//        displayTextMessages = (TextView) findViewById(R.id.create_group_chat_text_display);
//        mScrollView = (ScrollView) findViewById(R.id.my_scroll_view);
//
//
//    }
}