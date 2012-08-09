package org.wiztools.restclient;

import java.nio.charset.Charset;

/**
 *
 * @author schandran
 */
public class RoReqEntityStringBean implements ReqEntityString {
    
    private final String contentType;
    private final Charset charset;
    private final String body;

    @Override
    public String getBody() {
        return body;
    }

    @Override
    public Charset getCharset() {
        return charset;
    }

    @Override
    public String getContentType() {
        return contentType;
    }
    
    public RoReqEntityStringBean(final ReqEntityString requestEntity){
        contentType = requestEntity.getContentType();
        charset = requestEntity.getCharset();
        body = requestEntity.getBody();
    }

    @Override
    public String getContentTypeCharsetFormatted() {
        return Util.getFormattedContentType(contentType, charset);
    }

    @Override
    public Object clone(){
        return null;
    }
}