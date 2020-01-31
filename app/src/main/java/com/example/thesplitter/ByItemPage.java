package com.example.thesplitter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ByItemPage extends AppCompatActivity {

    ImageButton imageButton1;
    ImageButton imageButton2;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_by_item_page);

        getSupportActionBar().setDisplayHomeAsUpEnabled((true));
        getSupportActionBar().setTitle("By Item");

        ImageButton imagebutton1 = (ImageButton) findViewById(R.id.numberOfAddedPeopleEditImageButton);
        imagebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ByItemPage.this, EditPeoplePage.class));
            }
        });

        ImageButton imageButton2 = (ImageButton) findViewById(R.id.numberOfAddedItemImageButton);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ByItemPage.this, EditBillPage.class));
            }
        });

        button = (Button) findViewById(R.id.byItemPageButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment dialog = SelectItemToAddPeopleDialog.newInstance();
                dialog.show(getSupportFragmentManager(), "tag");
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; go home
                Intent intent = new Intent(this, Home.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
