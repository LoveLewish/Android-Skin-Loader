package cn.feng.skin.manager.listener;

import android.util.TypedValue;
import android.view.View;

/**
 * 属性更新
 */
public interface IAttrUpdate {
	void apply(View view, TypedValue tv);
}
