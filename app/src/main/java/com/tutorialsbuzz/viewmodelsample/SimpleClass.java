package com.tutorialsbuzz.viewmodelsample;

public class SimpleClass {
    private static final String TAG = "SimpleClass";
    private String mFirstName;
    private String mMiddleName;
    private String mLastName;


    SimpleClass() {

       /* mFirstName = "Default FirstName";
        mMiddleName = "Default MiddleName";
        mLastName = "Default LastName";*/
    }


    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getmMiddleName() {
        return mMiddleName;
    }

    public void setmMiddleName(String mMiddleName) {
        this.mMiddleName = mMiddleName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }
}