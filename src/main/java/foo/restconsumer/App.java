package foo.restconsumer;

import org.springframework.web.client.RestTemplate;

public class App 
{
    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Photo photo = restTemplate.getForObject("http://jsonplaceholder.typicode.com/photos/5", Photo.class);
        System.out.println("Album Id:       " + photo.getAlbumId());
        System.out.println("Id:             " + photo.getId());
        System.out.println("Title:          " + photo.getTitle());
        System.out.println("Url:            " + photo.getUrl());
        System.out.println("Thumbnail url:  " + photo.getThumbnailUrl());
    }

}
