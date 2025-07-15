package com.example.velog_app;

import com.example.velog_app.domain.Board;
import com.example.velog_app.repository.BoardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final BoardRepository boardRepository;

    public DataInitializer(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public void run(String... args) {
        if (boardRepository.count() == 0) {
            boardRepository.save(new Board(
                    "SPA와 React Router의 등장",
                    "**SPA(Single Page Application)**는 한 페이지에서 필요한 부분만 동적으로 바꿔주는 최신 웹앱 방식이에요. 전통적으로 <a href=\"\"> 태그를 쓰면 전체 페이지가 새로고침 됐지만, SPA에서는 화면 깜빡임 없이 빠르게 원하는 컴포넌트만 바꿀 수 있어요. 이 마법의 핵심이 바로 React Router! 페이지 이동을 자연스럽게 만들어 주는 라이브러리예요.",
                    "/img1.png", "작성자1", "/profile1.png", 5,"2025-07-05",10));

            boardRepository.save(new Board(
                    "React Router의 작동원리와 기초 세팅",
                    "React Router를 설치하면 라우터 객체를 만들어서 앱의 경로별로 어떤 컴포넌트를 보여줄지 정할 수 있어요. 주요 구성요소는 createBrowserRouter (라우팅 규칙 만들기), RouterProvider (앱 전체에 라우팅 기능 적용), Route (각 경로마다 보여줄 컴포넌트 지정) 등이 있습니다. 라우팅 규칙을 JS 객체(배열)로 만들어 관리합니다.",
                    "/img2.png", "작성자2", "/profile2.png", 65,"2025-07-08",5));

            boardRepository.save(new Board(
                    "과제 화이팅!",
                    "api 잘 불려와지나요?",
                    "/img3.png", "작성자3", "/profile3.png", 18,"2025-07-15",0));

            boardRepository.save(new Board(
                    "심바톤도 고생하셨습니다.",
                    "다들 수고많으셨어요! 중앙해커톤도 화이팅!! 리액트 재밌어요 ",
                    "/img4.png", "작성자4", "/profile4.png", 0,"2025-07-16",6));

            boardRepository.save(new Board(
                    "동적 라우팅과 useParams 활용",
                    "URL에 동적인 값(:postId 등)을 넣어 상세 주소를 만들 수 있어요. 예: /detail/3 이런 주소에서 **useParams()**를 사용하면 postId값(여기선 3)을 바로 받아올 수 있습니다. 이를 활용해 하나의 상세페이지 컴포넌트가 여러 게시글의 상세 화면을 동적으로 보여줄 수 있습니다.",
                    "/img5.png", "작성자5", "/profile5.png", 22,"2024-11-20",12));

            boardRepository.save(new Board(
                    "API란 무엇이고 왜 쓸까?",
                    "API(Application Programming Interface): 서버가 데이터를 꺼내 주거나, 정보를 받는 통로입니다. React와 같은 프론트엔드는 API를 통해 서버(백엔드)와 데이터를 주고받아요. 대표 예시: “벨로그 게시글 목록 받아오기”, “날씨 정보 받아오기” 등 실제 API 연동과 map, 템플릿 리터럴, 화살표 함수 기초 axios 라이브러리를 사용해 GET/POST 등 HTTP 통신을 편하게 할 수 있습니다. 배열 데이터를 다룰 때 map 함수, 문자열을 다룰 때 템플릿 리터럴(`) 사용, 함수를 짧게 쓸 때 화살표 함수 등을 활용하면 코드가 더 간단해집니다. 예시로, posts.map(post => <div>${post.title}</div>)처럼 게시글 목록을 반복 렌더링할 수 있어요.",
                    "/img6.png", "작성자6", "/profile6.jpg", 13,"2025-07-03",12));
        }
    }

}
