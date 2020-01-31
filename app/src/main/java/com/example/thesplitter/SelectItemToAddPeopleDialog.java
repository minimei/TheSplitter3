package com.example.thesplitter;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class SelectItemToAddPeopleDialog extends DialogFragment {

    ImageButton imageButton1;
    ImageButton imageButton2;

    static SelectItemToAddPeopleDialog newInstance(){
        return new SelectItemToAddPeopleDialog();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NORMAL, R.style.FullscreenDialogTheme);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_select_item_to_add_people, container, false);
        ImageButton imageButton1 = view.findViewById(R.id.dialogCloseImageButton);
        ImageButton imageButton2 = view.findViewById(R.id.dialogConfirmImageButton);



        return view;

    }
}
