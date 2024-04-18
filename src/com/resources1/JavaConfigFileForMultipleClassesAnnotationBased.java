package com.resources1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
//lecture 4
@Component
@ComponentScan("com.bean2")
//@ComponentScan({"com.bean2","com.bean"}) if you wan't to scan multiple packages
public class JavaConfigFileForMultipleClassesAnnotationBased {

}
