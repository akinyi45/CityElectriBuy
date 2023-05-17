package com.example.cityelectribuy;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010/\u001a\u000200H\u0002J\"\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00042\b\u00104\u001a\u0004\u0018\u000105H\u0014J\u0012\u00106\u001a\u0002002\b\u00107\u001a\u0004\u0018\u000108H\u0014J\b\u00109\u001a\u000200H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/example/cityelectribuy/AdddivicesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "PICK_IMAGE_REQUEST", "", "btn_choose_image", "Landroid/widget/Button;", "getBtn_choose_image", "()Landroid/widget/Button;", "setBtn_choose_image", "(Landroid/widget/Button;)V", "btn_upload_image", "getBtn_upload_image", "setBtn_upload_image", "edtColor", "Landroid/widget/EditText;", "getEdtColor", "()Landroid/widget/EditText;", "setEdtColor", "(Landroid/widget/EditText;)V", "edtModel", "getEdtModel", "setEdtModel", "edtPrice", "getEdtPrice", "setEdtPrice", "edtRegNo", "getEdtRegNo", "setEdtRegNo", "filePath", "Landroid/net/Uri;", "firebaseStore", "Lcom/google/firebase/storage/FirebaseStorage;", "imagePreview", "Landroid/widget/ImageView;", "getImagePreview", "()Landroid/widget/ImageView;", "setImagePreview", "(Landroid/widget/ImageView;)V", "progress", "Landroid/app/ProgressDialog;", "getProgress", "()Landroid/app/ProgressDialog;", "setProgress", "(Landroid/app/ProgressDialog;)V", "storageReference", "Lcom/google/firebase/storage/StorageReference;", "launchGallery", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "uploadImage", "app_debug"})
public final class AdddivicesActivity extends androidx.appcompat.app.AppCompatActivity {
    private final int PICK_IMAGE_REQUEST = 71;
    private android.net.Uri filePath;
    private com.google.firebase.storage.FirebaseStorage firebaseStore;
    private com.google.firebase.storage.StorageReference storageReference;
    public android.widget.ImageView imagePreview;
    public android.widget.Button btn_choose_image;
    public android.widget.Button btn_upload_image;
    public android.app.ProgressDialog progress;
    public android.widget.EditText edtModel;
    public android.widget.EditText edtColor;
    public android.widget.EditText edtRegNo;
    public android.widget.EditText edtPrice;
    
    public AdddivicesActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.ImageView getImagePreview() {
        return null;
    }
    
    public final void setImagePreview(@org.jetbrains.annotations.NotNull
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.Button getBtn_choose_image() {
        return null;
    }
    
    public final void setBtn_choose_image(@org.jetbrains.annotations.NotNull
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.Button getBtn_upload_image() {
        return null;
    }
    
    public final void setBtn_upload_image(@org.jetbrains.annotations.NotNull
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.ProgressDialog getProgress() {
        return null;
    }
    
    public final void setProgress(@org.jetbrains.annotations.NotNull
    android.app.ProgressDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEdtModel() {
        return null;
    }
    
    public final void setEdtModel(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEdtColor() {
        return null;
    }
    
    public final void setEdtColor(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEdtRegNo() {
        return null;
    }
    
    public final void setEdtRegNo(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEdtPrice() {
        return null;
    }
    
    public final void setEdtPrice(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void launchGallery() {
    }
    
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    private final void uploadImage() {
    }
}