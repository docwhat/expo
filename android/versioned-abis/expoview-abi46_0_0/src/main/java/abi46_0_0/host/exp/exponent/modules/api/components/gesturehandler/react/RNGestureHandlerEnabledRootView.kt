package abi46_0_0.host.exp.exponent.modules.api.components.gesturehandler.react

import android.content.Context
import android.util.AttributeSet
import abi46_0_0.com.facebook.react.ReactRootView

@Deprecated(message = "Use <GestureHandlerRootView /> component instead. Check gesture handler installation instructions in documentation for more information.")
class RNGestureHandlerEnabledRootView : ReactRootView {
  constructor(context: Context?) : super(context) {}
  constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {}

  init {
    throw UnsupportedOperationException("Your application is configured to use RNGestureHandlerEnabledRootView which is no longer supported. You can see how to migrate to <GestureHandlerRootView /> here: https://docs.swmansion.com/react-native-gesture-handler/docs/guides/migrating-off-rnghenabledroot")
  }
}
