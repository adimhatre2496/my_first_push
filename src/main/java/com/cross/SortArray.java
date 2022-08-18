package com.cross;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
@Log4j2 @Data
public class SortArray
    {

        public static void main(String[] args)
        {
           Lesson1 l=new Lesson1();
            log.info("Hii");

            l.setFirstName("Ade");
            log.info(l.getFirstName());

            int number[]={20,12,14,1,19,51,60,4,8};

            Arrays.sort(number);

            for (int i=0; i < number.length; i++)
            {
                log.info(number[i]);
            }

        }

    }
