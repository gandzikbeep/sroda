//package Pages.Config;
//
//public class FailureHandler extends BaseTest{
//    private final static String screenshotsDir = "screenshots/";
////    private String getCurrentTime() {
////        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH.mm.ss");
////        LocalDateTime currentTime = LocalDateTime.now();
////        return dateTimeFormatter.format(currentTime);
////    }
//
//    public void takeScreenshot(Scenario scenario) {
//        String timeToPrint = getCurrentTime();
//
//        File screenSource = ((TakesScreenshot) webDriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
//        try {
//            FileHandler.copy(screenSource, new File(screenshotsDir + "_" + scenario.getName() + timeToPrint + ".png"));
//            byte[] screenSource2 = ((TakesScreenshot)webDriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.embed(screenSource2, "image/png",timeToPrint);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
