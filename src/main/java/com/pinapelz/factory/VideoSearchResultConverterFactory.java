package com.pinapelz.factory;

import com.pinapelz.datatypes.Paginated;
import com.pinapelz.datatypes.SimpleVideo;
import com.pinapelz.datatypes.VideoSearchResult;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class VideoSearchResultConverterFactory extends Converter.Factory {

    public static VideoSearchResultConverterFactory create() {
        return new VideoSearchResultConverterFactory();
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        boolean isPaginated = false;
        for (Annotation annotation : annotations) {
            if (annotation instanceof Paginated) {
                isPaginated = ((Paginated) annotation).value();
            }
        }
        if (isPaginated) {
            Type listType = new ParameterizedType() {
                @Override
                public Type[] getActualTypeArguments() {
                    return new Type[]{VideoSearchResult.class};
                }

                @Override
                public Type getRawType() {
                    return List.class;
                }

                @Override
                public Type getOwnerType() {
                    return null;
                }
            };
            return retrofit.nextResponseBodyConverter(this, listType, annotations);
        } else {
            return retrofit.nextResponseBodyConverter(this, SimpleVideo.class, annotations);
        }
    }
}
