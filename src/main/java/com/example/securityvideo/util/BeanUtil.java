//package com.example.securityvideo.util;
//
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.BeanWrapper;
//import org.springframework.beans.BeanWrapperImpl;
//import org.springframework.stereotype.Service;
//
//import java.beans.FeatureDescriptor;
//import java.util.stream.Stream;
//
//@Service
//public class BeanUtil {
//
//    public static void copyNonNullProperties(Object source, Object destination) {
//        BeanUtils.copyProperties(source, destination, getNullPropertyNames(source));
//    }
//
//    private static String[] getNullPropertyNames(Object source) {
//        final BeanWrapper wrappedSource = new BeanWrapperImpl(source);
//        return Stream.of(wrappedSource.getPropertyDescriptors())
//                .map(FeatureDescriptor::getName)
//                .filter(propertyName -> wrappedSource.getPropertyValue(propertyName) == null)
//                .toArray(String[]::new);
//    }
//}
