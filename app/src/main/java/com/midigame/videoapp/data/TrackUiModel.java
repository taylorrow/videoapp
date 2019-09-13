package com.midigame.videoapp.data;

import android.os.Parcel;
import android.os.Parcelable;

public class TrackUiModel implements Parcelable {
    public String trackName;
    public int trackNumber;

    public TrackUiModel(Parcel in) {
        trackName = in.readString();
        trackNumber = in.readInt();
    }

    public static final Creator<TrackUiModel> CREATOR = new Creator<TrackUiModel>() {
        @Override
        public TrackUiModel createFromParcel(Parcel in) {
            return new TrackUiModel(in);
        }

        @Override
        public TrackUiModel[] newArray(int size) {
            return new TrackUiModel[size];
        }
    };

    public TrackUiModel() {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(trackName);
        parcel.writeInt(trackNumber);
    }
}
