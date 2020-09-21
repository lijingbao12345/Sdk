package com.example.two;

import android.os.Bundle;

public interface ICallback {

    void success(Bundle bundle);

    void fail(String err);

}
