package com.rishav.instaclone;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DonateStore2 {

    private DatabaseReference databaseReference;
    public DonateStore2(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference =  db.getReference(DonateStore.class.getSimpleName());
    }

    public Task<Void> add(DonateStore donateStore){
        return  databaseReference.push().setValue(donateStore);
    }
}
