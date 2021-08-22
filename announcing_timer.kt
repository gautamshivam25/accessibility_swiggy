fun isOtpTimer(view: View, isTimerFocused: ObservableField<Boolean>) {
    ViewCompat.setAccessibilityDelegate(view, object : AccessibilityDelegateCompat() {
     override fun onInitializeAccessibilityEvent(host: View?, event: AccessibilityEvent?) {
         if (event?.eventType == AccessibilityEvent.TYPE_VIEW_ACCESSIBILITY_FOCUSED) {
            isTimerFocused.set(true)
         }else if (event?.eventType == AccessibilityEvent.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) {
            isTimerFocused.set(false)
         }
        }
     })
}