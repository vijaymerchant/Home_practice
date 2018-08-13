package MainScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageObject {
	
	WebDriver driver=null;

	@FindBy(xpath=".//*[@id='content']/ul/li[1]/a")				//(linkText = "A/B Testing")
	WebElement AB_Testing;
	
	@FindBy(linkText = "Basic Auth")
	WebElement BasicAuth;
	
	@FindBy(linkText = "Broken Images")
	WebElement BrokenImages;

	@FindBy(linkText = "Challenging DOM")
	WebElement ChallengingDOM;
	
	@FindBy(linkText = "Checkboxes")
	WebElement Checkboxes;
	
	@FindBy(linkText = "Context Menu")
	WebElement ContextMenu;
	
	@FindBy(linkText = "Disappearing Elements")
	WebElement DisappearingElements;
	
	@FindBy(linkText = "Drag and Drop")
	WebElement DragandDrop;
	
	@FindBy(linkText = "Dropdown")
	WebElement Dropdown;
	
	@FindBy(linkText = "Dynamic Content")
	WebElement DynamicContent;
	
	@FindBy(linkText = "Dynamic Controls")
	WebElement DynamicControls;
	
	@FindBy(linkText = "Dynamic Loading")
	WebElement DynamicLoading;
	
	@FindBy(linkText = "Exit Intent")
	WebElement ExitIntent;
	
	@FindBy(linkText = "File Download")
	WebElement FileDownload;
	
	@FindBy(linkText = "File Upload")
	WebElement FileUpload;
	
	@FindBy(linkText = "Floating Menu")
	WebElement FloatingMenu;
	
	@FindBy(linkText = "Forgot Password")
	WebElement ForgotPassword;
	
	@FindBy(linkText = "Form Authentication")
	WebElement FormAuthentication;
	
	@FindBy(linkText = "Frames")
	WebElement Frames;
	
	@FindBy(linkText = "Geolocation")
	WebElement Geolocation;
	
	@FindBy(linkText = "Horizontal Slider")
	WebElement HorizontalSlider;
	
	@FindBy(linkText = "Hovers")
	WebElement Hovers;
	
	@FindBy(linkText = "Infinite Scroll")
	WebElement InfiniteScroll;
	
	@FindBy(linkText = "JQuery UI Menus")
	WebElement JQueryUIMenus;
	
	@FindBy(linkText = "JavaScript Alerts")
	WebElement JavaScriptAlerts;
	
	@FindBy(linkText = "JavaScript onload event error")
	WebElement JavaScriptonloadeventerror;
	
	@FindBy(linkText = "Key Presses")
	WebElement KeyPresses;
	
	@FindBy(linkText = "Large & Deep DOM")
	WebElement LargeandDeepDOM;
	
	@FindBy(linkText = "Multiple Windows")
	WebElement MultipleWindows;
	
	@FindBy(linkText = "Nested Frames")
	WebElement NestedFrames;
	
	@FindBy(linkText = "Notification Messages")
	WebElement NotificationMessages;
	
	@FindBy(linkText = "Redirect Link")
	WebElement RedirectLink;
	
	@FindBy(linkText = "Secure File Download")
	WebElement SecureFileDownload;
	
	@FindBy(linkText = "Shifting Content")
	WebElement ShiftingContent;
	
	@FindBy(linkText = "Slow Resources")
	WebElement SlowResources;
	
	@FindBy(linkText = "Sortable Data Tables")
	WebElement SortableDataTables;
	
	@FindBy(linkText = "Status Codes")
	WebElement StatusCodes;
	
	@FindBy(linkText = "Typos")
	WebElement Typos;
	
	@FindBy(linkText = "WYSIWYG Editor")
	WebElement WYSIWYGEditor;
	
	// Methods
	
	public void  AB_Testing_click 	(WebDriver driver) { this.driver=driver;  	 System.out.println(driver);   AB_Testing.click(); 		}
	  	
	public void  BasicAuth_click 	() {		  BasicAuth.click(); 		}
  	  	
	public void  BrokenImages_click 	() {		  BrokenImages.click(); 		}
 	 	
	public void  ChallengingDOM_click 	() {		  ChallengingDOM.click(); 		}
  	  	
	public void  Checkboxes_click 	() {		  Checkboxes.click(); 		}
  	  	
	public void  ContextMenu_click 	() {		  ContextMenu.click(); 		}
  	  	
	public void  DisappearingElements_click 	() {		  DisappearingElements.click(); 		}
  	  	
	public void  DragandDrop_click 	() {		  DragandDrop.click(); 		}
  	  	
	public void  Dropdown_click 	() {		  Dropdown.click(); 		}
  	  	
	public void  DynamicContent_click 	() {		  DynamicContent.click(); 		}
  	  	
	public void  DynamicControls_click 	() {		  DynamicControls.click(); 		}
  	  	
	public void  DynamicLoading_click 	() {		  DynamicLoading.click(); 		}
  	  	
	public void  ExitIntent_click 	() {		  ExitIntent.click(); 		}
  	  	
	public void  FileDownload_click 	() {		  FileDownload.click(); 		}
  	  	
	public void  FileUpload_click 	() {		  FileUpload.click(); 		}
  	  	
	public void  FloatingMenu_click 	() {		  FloatingMenu.click(); 		}
  	  	
	public void  ForgotPassword_click 	() {		  ForgotPassword.click(); 		}
  	  	
	public void  FormAuthentication_click 	() {		  FormAuthentication.click(); 		}
  	  	
	public void  Frames_click 	() {		  Frames.click(); 		}
  	  	
	public void  Geolocation_click 	() {		  Geolocation.click(); 		}
  	  	
	public void  HorizontalSlider_click 	() {		  HorizontalSlider.click(); 		}
  	  	
	public void  Hovers_click 	() {		  Hovers.click(); 		}
  	  	
	public void  InfiniteScroll_click 	() {		  InfiniteScroll.click(); 		}
  	  	
	public void  JQueryUIMenus_click 	() {		  JQueryUIMenus.click(); 		}
  	  	
	public void  JavaScriptAlerts_click 	() {		  JavaScriptAlerts.click(); 		}
  	  	
	public void  JavaScriptonloadeventerror_click 	() {		  JavaScriptonloadeventerror.click(); 		}
  	  	
	public void  KeyPresses_click 	() {		  KeyPresses.click(); 		}
  	  	
	public void  LargeandDeepDOM_click 	() {		  LargeandDeepDOM.click(); 		}
  	  	
	public void  MultipleWindows_click 	() {		  MultipleWindows.click(); 		}
  	  	
	public void  NestedFrames_click 	() {		  NestedFrames.click(); 		}
  	  	
	public void  NotificationMessages_click 	() {		  NotificationMessages.click(); 		}
  	  	
	public void  RedirectLink_click 	() {		  RedirectLink.click(); 		}
  	  	
	public void  SecureFileDownload_click 	() {		  SecureFileDownload.click(); 		}
  	  	
	public void  ShiftingContent_click 	() {		  ShiftingContent.click(); 		}
  	  	
	public void  SlowResources_click 	() {		  SlowResources.click(); 		}
  	  	
	public void  SortableDataTables_click 	() {		  SortableDataTables.click(); 		}
  	  	
	public void  StatusCodes_click 	() {		  StatusCodes.click(); 		}
  	  	
	public void  Typos_click 	() {		  Typos.click(); 		}
  	  	
	public void  WYSIWYGEditor_click 	() {		  WYSIWYGEditor.click(); 		}
		

		

	


}
