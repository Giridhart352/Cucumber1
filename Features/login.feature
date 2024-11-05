Feature: Login with valid credentials
Scenario: Login with valid credentials
Given Open Chrome browser
And Open URL "https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_8ipd9izczt_e&adgrpid=1328211703591630&hvadid=83013495293827&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=156428&hvtargid=kwd-83014163717471:loc-90&hydadcr=5621_2377279&msclkid=1f33806b801d1108bed3e69415bbd8d5"
When Login ID Login Password
And click on submit
Then Redirect to  Home page