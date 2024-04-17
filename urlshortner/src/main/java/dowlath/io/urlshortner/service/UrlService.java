package dowlath.io.urlshortner.service;

import dowlath.io.urlshortner.model.Url;
import dowlath.io.urlshortner.model.UrlDto;
import org.springframework.stereotype.Service;

@Service
public interface UrlService
{
    public Url generateShortLink(UrlDto urlDto);
    public Url persistShortLink(Url url);
    public Url getEncodedUrl(String url);
    public  void  deleteShortLink(Url url);
}