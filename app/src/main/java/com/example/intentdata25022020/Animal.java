package com.example.intentdata25022020;

import android.os.Parcel;
import android.os.Parcelable;

public class Animal implements Parcelable {
    String name;
    int weight;

    public Animal() {
    }

    protected Animal(Parcel in) {
        name = in.readString();
        weight = in.readInt();
    }

    public static final Creator<Animal> CREATOR = new Creator<Animal>() {
        @Override
        public Animal createFromParcel(Parcel in) {
            return new Animal(in);
        }

        @Override
        public Animal[] newArray(int size) {
            return new Animal[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(weight);
    }
}
