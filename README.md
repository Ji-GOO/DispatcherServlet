# DispatcherServlet

# 동작순서
1. 요청을 분석함. (Locale, Theme, Multipart 등등)
2. 요청을 처리할 핸들러를 찾음. (HandlerMapping)
3. 찾은 핸들러를 실행할 수 있는 핸들러 어댑터를 찾음. (HandlerAdapter)
4. 찾아낸 핸들러 어댑터를 사용해 핸들러의 응답을 처리함.
5. 핸들러의 리턴 값을 보고 어떻게 처리할지 판단함. (ViewResolver)
    - 뷰 이름에 해당하는 뷰를 찾아 모델 데이터를 렌더링함.
    - @ResponseEntity가 있으면 컨버터를 사용해 응답 본문을 만듦.
6. 만약 처리하는 도중 예외가 발생 예외 처리 핸들러에게 요청 처리를 위임함. (HandlerExceptionResolver)
7. 응답을 보냄.
