ViewCompat.setAccessibilityDelegate(view, object : AccessibilityDelegateCompat() {
     override fun onInitializeAccessibilityNodeInfo(host: View, info: AccessibilityNodeInfoCompat) {
         super.onInitializeAccessibilityNodeInfo(host, info)
         info.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK)
         info.isClickable = false
     }
})