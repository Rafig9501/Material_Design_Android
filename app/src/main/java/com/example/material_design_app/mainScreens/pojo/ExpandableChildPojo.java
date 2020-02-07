package com.example.material_design_app.mainScreens.pojo;

import android.os.Parcel;
import android.os.Parcelable;

public class ExpandableChildPojo implements Parcelable {

    String phone;
    String email;

    public ExpandableChildPojo(Parcel parcel) {

        phone = parcel.readString();

        email = parcel.readString();
    }

    public ExpandableChildPojo(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public static final Creator<ExpandableChildPojo> CREATOR = new Creator<ExpandableChildPojo>() {
        @Override
        public ExpandableChildPojo createFromParcel(Parcel in) {
            return new ExpandableChildPojo(in);
        }

        @Override
        public ExpandableChildPojo[] newArray(int size) {
            return new ExpandableChildPojo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeString(phone);

        parcel.writeString(email);
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
