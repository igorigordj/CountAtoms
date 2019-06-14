package com.primeHolding;

public class Main {

    //Group of allowed characters in formula
    static String allowedCharacters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz()[]";


    public static void main(String[] args) {

        try {

            countAtoms("NaCl");
            System.out.println();

            countAtoms("Ca(OH)2");
            System.out.println();

            countAtoms("Al2(SO4)3");
            System.out.println();

            countAtoms("[Cu(NH3)4(H2O)2]SO4");
            System.out.println();

            countAtoms("H2*P-12");

        } catch (WrongElementException e) {
            e.printStackTrace();
        }


    }

    public static void countAtoms(String molecule) throws WrongElementException {


        //Splitting the molecule
        String[] atoms = molecule.split("(?=\\p{Upper})");
        String[] chars = molecule.split("(?!^)");

        //checking if character in formula is allowed
        for (int i = 0; i < chars.length; i++) {

            int countAtom = 0;
            if (allowedCharacters.contains(chars[i])) {
                try {
                    countAtom++;
                    System.out.print(atoms[i] + countAtom);
                } catch (Exception e) {
                    e.getMessage();
                }

            } else {
                throw new WrongElementException("incorrect formula");
            }
        }


    }


}
