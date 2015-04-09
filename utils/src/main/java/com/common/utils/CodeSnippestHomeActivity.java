package com.common.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.common.example.AddressOnMapActivity;
import com.common.example.AppIconAct;
import com.common.example.ArraylistToStringActivity;
import com.common.example.BackGroundMusicStartStopAct;
import com.common.example.BluetoothOrWifiOnOffAct;
import com.common.example.BlurEffectActivity;
import com.common.example.ChooseProfileActivity;
import com.common.example.ClientGetActivity;
import com.common.example.ClientPostActivity;
import com.common.example.ClientPostMultipartEntityActivity;
import com.common.example.ColorPickerActivity;
import com.common.example.CreateFolderActivity;
import com.common.example.DateDifferenceActivity;
import com.common.example.DownloadActivity;
import com.common.example.DownloadImageFromUrlAct;
import com.common.example.DrawableToBitmapActivity;
import com.common.example.EmailContactsScreenShotActivity;
import com.common.example.FileCountActivity;
import com.common.example.GetCurrentLocationAct;
import com.common.example.GetPrefAct;
import com.common.example.GetRandomNumberAct;
import com.common.example.ImageVideoActivity;
import com.common.example.OpenUrlINBrowserAct;
import com.common.example.PickCaptureActivity;
import com.common.example.PinchZoomImageViewAct;
import com.common.example.PostFixForNumberAct;
import com.common.example.PreventClickActivity;
import com.common.example.RoundedBitmapActivity;
import com.common.example.SaveImageInPreference;
import com.common.example.ScreenModeDis_Ean_Act;
import com.common.example.SendLocatoNotificationAct;
import com.common.example.SetPrefAct;
import com.common.example.StringToDateActivity;
import com.common.example.ToastActivity;
import com.common.example.UrlValidationRippleActivity;
import com.common.example.VerticalTextViewsActivity;
import com.common.example.VolumeActivity;

public class CodeSnippestHomeActivity extends Activity {

    Context mContext;
    Activity mActivity;
    ListView sdkFunctionalityList;
    private TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = CodeSnippestHomeActivity.this;
        mActivity = CodeSnippestHomeActivity.this;

        tvText = (TextView) findViewById(R.id.text);
        String[] sdkFunctionalityListValue = new String[]{
                "Executing a HTTP Get Request",/* 0 */
                "Executing a HTTP Post Request",/* 1 */
                "Executing a HTTP post Request for Send Audio,Video and Image",/* 2 */
        };

        sdkFunctionalityList = (ListView) findViewById(R.id.Md_list_company);

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, sdkFunctionalityListValue);
        sdkFunctionalityList.setAdapter(stringArrayAdapter);

        sdkFunctionalityList.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                selectedListItem(position);
            }

        });

        sdkFunctionalityList.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                tvText.setText("");
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

            }
        });
    }

    protected void selectedListItem(int position) {
        Intent intent = null;

        switch (position) {
            case 0:
                Intent intget = new Intent(mContext, ClientGetActivity.class);
                startActivity(intget);
                break;
            case 1:
                Intent intpost = new Intent(mContext, ClientPostActivity.class);
                startActivity(intpost);
            case 2:
                Intent intmulti = new Intent(mContext, ClientPostMultipartEntityActivity.class);
                startActivity(intmulti);
                break;

        }
        if (intent != null)
            startActivity(intent);
    }
}
