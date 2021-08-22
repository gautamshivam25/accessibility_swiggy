ViewCompat.setAccessibilityDelegate(view, object : AccessibilityDelegateCompat() {
 override fun onInitializeAccessibilityNodeInfo(host: View?, info: AccessibilityNodeInfoCompat?) {
     super.onInitializeAccessibilityNodeInfo(host, info)
     val action = AccessibilityNodeInfoCompat.AccessibilityActionCompat(
         AccessibilityNodeInfoCompat.ACTION_CLICK,
         "custom action text"
     )
     info?.addAction(action)
     info?.isEnabled = isEnabled(true/false)
    }
})