package LambdaTrening;

//1) Ile jest wszystkich słów?
//        2) Ile słów zaczyna się na literę 'D'?
//        3) Policz, ile jest słów o danej długości (Map<Integer, Integer>)
//        4) Jaka litera pojawia się narzadziej?
//        5*) Ile jest słów, które posiadają dwie identyczne litery obok siebie (np. 'g' w "debugger")?
//        6**) Ile jest słów, które są palindromami?

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LoremIpsum {

    public static final String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla porttitor, turpis a vulputate eleifend, nunc dolor lobortis nisl, ut mollis justo ipsum ac mi. In a iaculis nunc, eu scelerisque quam. Fusce in dignissim neque, in porttitor orci. Proin a pharetra tellus, non venenatis eros. Aenean quis mi eros. Cras tempus interdum lacus, non commodo dui tincidunt at. Donec vitae turpis tempor, viverra urna eget, consectetur magna. Nam elementum elit non faucibus condimentum. In vulputate tortor risus, id ullamcorper dolor vehicula sed. Ut turpis eros, mattis eget egestas a, condimentum sed purus.\n" +
            "\n" +
            "Nulla urna urna, ultrices eget velit ut, auctor dignissim dui. Etiam aliquam eget mauris ac consequat. Ut turpis diam, pretium id vehicula nec, finibus vitae turpis. Morbi nulla ipsum, venenatis ut euismod et, facilisis id nunc. Suspendisse ligula purus, rhoncus pulvinar ante eget, feugiat egestas dui. Sed vel mollis dui. Aliquam venenatis magna massa, ut maximus mi volutpat quis. Vestibulum velit nulla, condimentum rhoncus felis at, pretium tincidunt mauris.\n" +
            "\n" +
            "Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Sed bibendum finibus ornare. Ut eu facilisis ipsum, vel mollis ante. Donec molestie elit elit, ac bibendum orci ultricies sed. Integer semper magna pellentesque, ornare libero id, blandit magna. Maecenas sit amet tristique velit. Quisque fermentum laoreet massa.\n" +
            "\n" +
            "Nam ex dolor, suscipit et lacinia eu, eleifend ut elit. Maecenas placerat euismod pulvinar. Vivamus fermentum imperdiet orci vitae porttitor. Nunc nec ornare justo, ut blandit elit. Pellentesque commodo tortor ac nunc mollis, non tincidunt nisl suscipit. Curabitur at tincidunt sapien. Aenean eu elit vitae justo hendrerit tempus. Vestibulum sollicitudin lobortis blandit. Fusce et augue faucibus lectus fringilla maximus quis sit amet lectus. Etiam facilisis, metus non ultrices lacinia, ligula purus iaculis leo, et pulvinar purus massa ut lacus. Nunc lacinia neque eget leo ultricies, at elementum est mattis. Proin elementum urna eget odio vehicula pulvinar. Pellentesque quis tellus sit amet quam aliquet viverra. Quisque mattis lacinia mollis.\n" +
            "\n" +
            "Mauris at purus non est feugiat imperdiet. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Phasellus id sodales quam. Donec vitae risus vitae velit dictum tempus. Nunc dictum cursus quam ac consectetur. Morbi id vestibulum est, quis tincidunt turpis. Nullam id luctus justo. Nulla ac est semper, accumsan neque sit amet, mollis nisl. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec magna nisl, viverra a diam ac, sodales consequat orci.";


    public static List<String> loremToList(){
        return Stream.of(lorem.split("\\W"))
                .filter(s -> (!s.isBlank()))
                .collect(Collectors.toList());
    }

}




