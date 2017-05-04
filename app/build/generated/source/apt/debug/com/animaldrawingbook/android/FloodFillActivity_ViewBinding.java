// Generated code from Butter Knife. Do not modify!
package com.animaldrawingbook.android;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import apps4kids.painting.R;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.support.customviews.HorizontalListView;
import com.utils.FloodFillImageView;
import com.utils.ZoomLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FloodFillActivity_ViewBinding<T extends FloodFillActivity> implements Unbinder {
  protected T target;

  private View view2131624043;

  @UiThread
  public FloodFillActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.sketchViewContainer = Utils.findRequiredViewAsType(source, R.id.sketchContainer, "field 'sketchViewContainer'", ZoomLayout.class);
    target.pen_layout = Utils.findRequiredViewAsType(source, R.id.pens_function, "field 'pen_layout'", RelativeLayout.class);
    target.horizontalListView = Utils.findRequiredViewAsType(source, R.id.hl_color, "field 'horizontalListView'", HorizontalListView.class);
    target.mDrawingPanelLayout = Utils.findRequiredViewAsType(source, R.id.drawingPanelLayout, "field 'mDrawingPanelLayout'", RelativeLayout.class);
    target.penbtn = Utils.findRequiredViewAsType(source, R.id.penbtn, "field 'penbtn'", Button.class);
    target.undobtn = Utils.findRequiredViewAsType(source, R.id.undobtn, "field 'undobtn'", Button.class);
    target.redobtn = Utils.findRequiredViewAsType(source, R.id.redobtn, "field 'redobtn'", Button.class);
    target.color_pickbtn = Utils.findRequiredViewAsType(source, R.id.color_picker, "field 'color_pickbtn'", Button.class);
    target.zoomIntroLayout = Utils.findRequiredViewAsType(source, R.id.zoomIntroLayout, "field 'zoomIntroLayout'", LinearLayout.class);
    target.zoomChildLayout = Utils.findRequiredViewAsType(source, R.id.zoomChildLayout, "field 'zoomChildLayout'", LinearLayout.class);
    target.floodFillImageView = Utils.findRequiredViewAsType(source, R.id.floodFillImageView, "field 'floodFillImageView'", FloodFillImageView.class);
    view = Utils.findRequiredView(source, R.id.btnIntroOk, "method 'introOkClicked'");
    view2131624043 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.introOkClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.sketchViewContainer = null;
    target.pen_layout = null;
    target.horizontalListView = null;
    target.mDrawingPanelLayout = null;
    target.penbtn = null;
    target.undobtn = null;
    target.redobtn = null;
    target.color_pickbtn = null;
    target.zoomIntroLayout = null;
    target.zoomChildLayout = null;
    target.floodFillImageView = null;

    view2131624043.setOnClickListener(null);
    view2131624043 = null;

    this.target = null;
  }
}
