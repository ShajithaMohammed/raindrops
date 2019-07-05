class RaindropConverter {

    String convert(int number) {
        int plingConversion = 3, plangConversion = 5, plongConversion = 7;

        String rainConversion = "";

        rainConversion = (number % plingConversion == 0) ? "Pling" : "";
        rainConversion += (number % plangConversion == 0) ? "Plang" : "";
        rainConversion += (number % plongConversion == 0) ? "Plong" : "";


        return (rainConversion.equals("")) ? String.valueOf(number) : rainConversion;
    }

}
