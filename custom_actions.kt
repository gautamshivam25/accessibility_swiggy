ViewCompat.setAccessibilityDelegate(view, object : AccessibilityDelegateCompat() {
 override fun onInitializeAccessibilityNodeInfo(host: View?, info: AccessibilityNodeInfoCompat?) {
     super.onInitializeAccessibilityNodeInfo(host, info)
     val action1 = AccessibilityNodeInfoCompat.AccessibilityActionCompat(
         R.id.custom_action1
         "custom action 1 text"
     )
     val action2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat(
         R.id.custom_action2
         "custom action 2 text"
     )
     info?.addAction(action1)
     info?.addAction(action2)
    }
})