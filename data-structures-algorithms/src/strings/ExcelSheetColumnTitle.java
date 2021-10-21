package strings;

//https://leetcode.com/problems/excel-sheet-column-title/
public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int columnNumber = 52;
        String excelCol = convertToTitle(columnNumber);
        System.out.println(excelCol);
    }

    //easy way
    public static String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder();

        while(columnNumber > 0) {
            columnNumber = columnNumber - 1;
            sb.insert(0, (char) ('A' + columnNumber%26));
            columnNumber/=26;
        }

        return sb.toString();
    }

    //my way
//    public static String convertToTitle(int columnNumber) {
//
//        StringBuilder sb = new StringBuilder();
//        while(columnNumber > 26) {
//            int rem = columnNumber%26;
//            columnNumber/=26;
//
//            char ch;
//            if(rem == 0) {
//                ch = 'Z';
//                columnNumber--;
//            } else {
//                ch = (char) (rem + 64);
//            }
//            sb.insert(0, ch);
//        }
//
//        char ch = (char) (columnNumber + 64);
//        sb.insert(0, ch);
//
//        return sb.toString();
//    }
}
