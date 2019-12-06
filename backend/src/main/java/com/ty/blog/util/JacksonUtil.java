package com.ty.blog.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.text.SimpleDateFormat;

/**
 * @ClassName: JacksonUtil
 * @Description: Gson工具类
 * @author zhangtainyi
 * @date 2019/11/20 16:44
 *
 */
public class JacksonUtil {
    private static ObjectMapper jsonMapper = new JsonMapper();

    public static String formatDate(Object object, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String json = null;
        try {
            json = jsonMapper.setDateFormat(simpleDateFormat).writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }
}
