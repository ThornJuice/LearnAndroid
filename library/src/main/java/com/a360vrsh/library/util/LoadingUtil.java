package com.a360vrsh.library.util;




import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import com.a360vrsh.baselibrary.R;
import com.a360vrsh.library.widget.MyDialogFragment;

import java.lang.ref.WeakReference;

/**
 * @author: wxj
 * @date: 2020/10/19
 * @description:
 */
public class LoadingUtil {

    private static MyDialogFragment dialogFragment;

    public static void showLoading(FragmentActivity activity) {
        showLoading(activity, true);
    }

    public static void showLoading(FragmentActivity activity, boolean cancelable) {
        WeakReference<FragmentActivity> activityWeakReference = new WeakReference<FragmentActivity>(activity);
        FragmentActivity fragmentActivity = activityWeakReference.get();
        if (fragmentActivity == null || fragmentActivity.isFinishing()) {
            return;
        }
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
            dialogFragment = null;
        }
        dialogFragment = new MyDialogFragment();
        dialogFragment.setCancelable(cancelable);
        dialogFragment.setStyle(DialogFragment.STYLE_NORMAL, R.style.library_loading_dialog);
        dialogFragment.showAllowingLoss(activity.getSupportFragmentManager(), "myDialogFragment");
    }

    public static void disMissLoading() {
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
            dialogFragment = null;
        }
    }
}
