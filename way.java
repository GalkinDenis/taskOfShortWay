package com.example.contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class way {
    public static void main(String[] args) {

        ArrayList<String> side = new ArrayList<String>();
        ArrayList<Integer> size = new ArrayList<Integer>();

        ArrayList<String> outSide = new ArrayList<String>();
        ArrayList<Integer> outSize = new ArrayList<Integer>();

        String parse;
        String[] read;

        String getSide;
        int getSize;

        int outSum;

        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            for(;;){
                parse = bf.readLine();
                if(parse == null){
                    break;
                }
                read = parse.split(" ");
                side.add(read[0]);
                size.add(Integer.parseInt(read[1]));
            }

            for(int i = 0; i < side.size(); i++) {
                getSide = side.get(i);
                getSize = size.get(i);
                getSide.concat("jj");
                if (i == 0) {
                    continue;
                }

                switch (getSide) {
                    case "TOP":
                        if (getSide.equals(side.get(i - 1))) {
                            //System.out.println("1");
                            outSum = getSize + size.get(i - 1);
                            size.set(i - 1, outSum);
                            side.remove(i);
                            size.remove(i);
                            i--;
                            continue;
                        }
                        if (side.get(i - 1).equals("BOTTOM")) {
                            if (getSize < size.get(i - 1)) {
                                //System.out.println("2");
                                outSum = size.get(i - 1) - getSize;
                                size.set(i - 1, outSum);
                                side.remove(i);
                                size.remove(i);
                                i--;
                                continue;
                            } else if (getSize > size.get(i - 1)) {
                                //System.out.println("3");
                                outSum = getSize - size.get(i - 1);
                                side.set(i - 1, getSide);
                                size.set(i - 1, outSum);
                                side.remove(i);
                                size.remove(i);
                                i--;
                                continue;
                            } else {
                                //System.out.println("4");
                                side.remove(i);
                                size.remove(i);
                                side.remove(i - 1);
                                size.remove(i - 1);
                                i = i - 2;
                                continue;
                            }
                        }
                        break;

                    case "BOTTOM":
                        if (getSide.equals(side.get(i - 1))) {
                            outSum = getSize + size.get(i - 1);
                            size.set(i - 1, outSum);
                            side.remove(i);
                            size.remove(i);
                            i--;
                            continue;
                        }
                        if (side.get(i - 1).equals("TOP")) {
                            if (getSize < size.get(i - 1)) {
                                outSum = size.get(i - 1) - getSize;
                                size.set(i - 1, outSum);
                                side.remove(i);
                                size.remove(i);
                                i--;
                                continue;
                            } else if (getSize > size.get(i - 1)) {
                                outSum = getSize - size.get(i - 1);
                                side.set(i - 1, getSide);
                                size.set(i - 1, outSum);
                                side.remove(i);
                                size.remove(i);
                                i--;
                                continue;
                            } else {
                                side.remove(i);
                                size.remove(i);
                                side.remove(i - 1);
                                size.remove(i - 1);
                                i = i - 2;
                                continue;
                            }
                        }
                        break;






                    case "LEFT":
                        if (getSide.equals(side.get(i - 1))) {
                            //System.out.println("1");
                            outSum = getSize + size.get(i - 1);
                            size.set(i - 1, outSum);
                            side.remove(i);
                            size.remove(i);
                            i--;
                            continue;
                        }
                        if (side.get(i - 1).equals("RIGHT")) {
                            if (getSize < size.get(i - 1)) {
                                //System.out.println("2");
                                outSum = size.get(i - 1) - getSize;
                                size.set(i - 1, outSum);
                                side.remove(i);
                                size.remove(i);
                                i--;
                                continue;
                            } else if (getSize > size.get(i - 1)) {
                                //System.out.println("3");
                                outSum = getSize - size.get(i - 1);
                                side.set(i - 1, getSide);
                                size.set(i - 1, outSum);
                                side.remove(i);
                                size.remove(i);
                                i--;
                                continue;
                            } else {
                                //System.out.println("4");
                                side.remove(i);
                                size.remove(i);
                                side.remove(i - 1);
                                size.remove(i - 1);
                                i = i - 2;
                                continue;
                            }
                        }
                        break;







                    case "RIGHT":
                        if (getSide.equals(side.get(i - 1))) {
                            //System.out.println("1");
                            outSum = getSize + size.get(i - 1);
                            size.set(i - 1, outSum);
                            side.remove(i);
                            size.remove(i);
                            i--;
                            continue;
                        }
                        if (side.get(i - 1).equals("LEFT")) {
                            if (getSize < size.get(i - 1)) {
                                //System.out.println("2");
                                outSum = size.get(i - 1) - getSize;
                                size.set(i - 1, outSum);
                                side.remove(i);
                                size.remove(i);
                                i--;
                                continue;
                            } else if (getSize > size.get(i - 1)) {
                                //System.out.println("3");
                                outSum = getSize - size.get(i - 1);
                                side.set(i - 1, getSide);
                                size.set(i - 1, outSum);
                                side.remove(i);
                                size.remove(i);
                                i--;
                                continue;
                            } else {
                                //System.out.println("4");
                                side.remove(i);
                                size.remove(i);
                                side.remove(i - 1);
                                size.remove(i - 1);
                                i = i - 2;
                                continue;
                            }
                        }
                        break;

                    default:
                        break;
                }

            }
                for(int c = 0; c < side.size(); c++){
                    System.out.println(side.get(c) + " " + size.get(c));
                }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
