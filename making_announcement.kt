AccessibilityManager accessibilityManager = (AccessibilityManager) mContext.getSystemService(Context.ACCESSIBILITY_SERVICE);

if (accessibilityManager == null || !accessibilityManager.isEnabled) return

AccessibilityEvent event = AccessibilityEvent.obtain(AccessibilityEvent.TYPE_ANNOUNCEMENT);
event.setClassName("class name");
event.setPackageName("package name");
event.getText().add("text to be announced");

accessibilityManager.sendAccessibilityEvent(event);