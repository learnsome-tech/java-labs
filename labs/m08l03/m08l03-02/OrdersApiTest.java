// Modern Java: Virtual Threads & High-Throughput Services — lesson m08l03 — Testing APIs With MockMvc
// https://learnsome.tech/courses/java-course/watch?lesson=m08l03
// © LearnSome.tech
mockMvc.perform(get("/orders/one"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.id").value("one"));
