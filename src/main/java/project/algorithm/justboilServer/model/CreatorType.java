package project.algorithm.justboilServer.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum CreatorType {

    TYPE1(1, Arrays.asList("UCyn-K7rZLXjGl7VXGweIlcA", "UCFiYPUhUzLKoi-cZ0AwpjLA", "UCPWFxcwPliEBMwJjmeFIDIg", "UCC8bTxyN2ZCfMzS_JAEClfA", "UC0htUSwcxfSGNfK_5Q28JkA", "UC-CnwTZJ_A5v-AQK92fNYKw", "UCXKEhG9Mcp7VnbhSgzb5sGg", "UCemFUqq5jad1f258HrPS5rg", "UCy2WX3w5UyYFHBDHyWFKNUQ", "UCC9pQY_uaBSa0WOpMNJHbEQ", "UCKrhyP3raTJQ38m-US2uMjg", "UC0YYag_QxVigWy_VH5hjB0w", "UCslni4iVQ-e784AU83eVcnQ", "UC37fRkl_iIjDAr9pf0FFzGA", "UCGL-5gylJg3G7T7epVBnhtQ", "UCL3XQXfvshedwa_j-Umx8wg", "UCNB-6ArklP1Mgg11-Og2zMg", "UCZaarGiwxVusY_jQlnftbIA", "UC2IIBYSTMSvJaK2UJzCC06g", "UCdJrAPeZHw72aPBcgCVpv7g", "UCcNUpInQt1tI3JC_oTPQ20w", "UCKA_6r3CWC76x_EaFO6jsPA", "UC_BVJYxQxN5jberGxAFDlyg", "UCRzS1NJFpMLiLbB0vMJXX4w", "UCgwho5LJTUFaZsLmXnt1Mlw", "UCUAKaXyq2hVBCph1LOUtuqg", "UCGGdlC3XCJpRJd12-cqucqw", "UC0VR2v4TZeGcOrZHnmwbU_Q", "UC4Icothd_W0M7jRzNyAszoA", "UCMXFSqYCTcB4iIJLwUJaBrQ", "UCrn5CaT8RoeFGpWJdmO4OwA", "UC1g9JaEVLOFGhH8hpaK--Jg")),
    TYPE2(2, Arrays.asList("UCFiYPUhUzLKoi-cZ0AwpjLA", "UCPWFxcwPliEBMwJjmeFIDIg", "UCC8bTxyN2ZCfMzS_JAEClfA", "UC-CnwTZJ_A5v-AQK92fNYKw", "UCXKEhG9Mcp7VnbhSgzb5sGg", "UCKrhyP3raTJQ38m-US2uMjg", "UC0YYag_QxVigWy_VH5hjB0w", "UCslni4iVQ-e784AU83eVcnQ", "UC37fRkl_iIjDAr9pf0FFzGA", "UCL3XQXfvshedwa_j-Umx8wg", "UCZaarGiwxVusY_jQlnftbIA", "UCdJrAPeZHw72aPBcgCVpv7g", "UCKA_6r3CWC76x_EaFO6jsPA", "UCUAKaXyq2hVBCph1LOUtuqg", "UCGGdlC3XCJpRJd12-cqucqw", "UC4Icothd_W0M7jRzNyAszoA", "UCMXFSqYCTcB4iIJLwUJaBrQ")),
    TYPE3(3, Arrays.asList("UCyn-K7rZLXjGl7VXGweIlcA", "UC0htUSwcxfSGNfK_5Q28JkA", "UCemFUqq5jad1f258HrPS5rg", "UCy2WX3w5UyYFHBDHyWFKNUQ", "UCC9pQY_uaBSa0WOpMNJHbEQ", "UCGL-5gylJg3G7T7epVBnhtQ", "UCNB-6ArklP1Mgg11-Og2zMg", "UC2IIBYSTMSvJaK2UJzCC06g", "UCcNUpInQt1tI3JC_oTPQ20w", "UC_BVJYxQxN5jberGxAFDlyg", "UCRzS1NJFpMLiLbB0vMJXX4w", "UCgwho5LJTUFaZsLmXnt1Mlw", "UC0VR2v4TZeGcOrZHnmwbU_Q", "UCrn5CaT8RoeFGpWJdmO4OwA", "UC1g9JaEVLOFGhH8hpaK--Jg")),
    TYPE4(4, Arrays.asList("UCFiYPUhUzLKoi-cZ0AwpjLA", "UCPWFxcwPliEBMwJjmeFIDIg", "UCC8bTxyN2ZCfMzS_JAEClfA", "UC0htUSwcxfSGNfK_5Q28JkA", "UC-CnwTZJ_A5v-AQK92fNYKw", "UCXKEhG9Mcp7VnbhSgzb5sGg", "UCemFUqq5jad1f258HrPS5rg", "UCy2WX3w5UyYFHBDHyWFKNUQ", "UCC9pQY_uaBSa0WOpMNJHbEQ", "UCKrhyP3raTJQ38m-US2uMjg", "UC0YYag_QxVigWy_VH5hjB0w", "UCslni4iVQ-e784AU83eVcnQ", "UC37fRkl_iIjDAr9pf0FFzGA", "UCL3XQXfvshedwa_j-Umx8wg", "UCZaarGiwxVusY_jQlnftbIA", "UCgwho5LJTUFaZsLmXnt1Mlw", "UCUAKaXyq2hVBCph1LOUtuqg", "UCGGdlC3XCJpRJd12-cqucqw", "UCMXFSqYCTcB4iIJLwUJaBrQ", "UC1g9JaEVLOFGhH8hpaK--Jg")),
    TYPE5(5, Arrays.asList("UCyn-K7rZLXjGl7VXGweIlcA", "UCGL-5gylJg3G7T7epVBnhtQ", "UCNB-6ArklP1Mgg11-Og2zMg", "UC2IIBYSTMSvJaK2UJzCC06g", "UCdJrAPeZHw72aPBcgCVpv7g", "UCcNUpInQt1tI3JC_oTPQ20w", "UCKA_6r3CWC76x_EaFO6jsPA", "UC_BVJYxQxN5jberGxAFDlyg", "UCRzS1NJFpMLiLbB0vMJXX4w", "UC0VR2v4TZeGcOrZHnmwbU_Q", "UC4Icothd_W0M7jRzNyAszoA", "UCrn5CaT8RoeFGpWJdmO4OwA")),
    TYPE6(6, Arrays.asList("UCFiYPUhUzLKoi-cZ0AwpjLA", "UCPWFxcwPliEBMwJjmeFIDIg", "UCC8bTxyN2ZCfMzS_JAEClfA", "UC-CnwTZJ_A5v-AQK92fNYKw", "UCXKEhG9Mcp7VnbhSgzb5sGg", "UCemFUqq5jad1f258HrPS5rg", "UCKrhyP3raTJQ38m-US2uMjg", "UC0YYag_QxVigWy_VH5hjB0w", "UC37fRkl_iIjDAr9pf0FFzGA", "UCGL-5gylJg3G7T7epVBnhtQ", "UCL3XQXfvshedwa_j-Umx8wg", "UCdJrAPeZHw72aPBcgCVpv7g", "UCcNUpInQt1tI3JC_oTPQ20w", "UCKA_6r3CWC76x_EaFO6jsPA", "UCUAKaXyq2hVBCph1LOUtuqg", "UCGGdlC3XCJpRJd12-cqucqw", "UC4Icothd_W0M7jRzNyAszoA", "UCMXFSqYCTcB4iIJLwUJaBrQ", "UC1g9JaEVLOFGhH8hpaK--Jg")),
    TYPE7(7, Arrays.asList("UCyn-K7rZLXjGl7VXGweIlcA", "UC0htUSwcxfSGNfK_5Q28JkA", "UCy2WX3w5UyYFHBDHyWFKNUQ", "UCC9pQY_uaBSa0WOpMNJHbEQ", "UCslni4iVQ-e784AU83eVcnQ", "UCNB-6ArklP1Mgg11-Og2zMg", "UCZaarGiwxVusY_jQlnftbIA", "UC2IIBYSTMSvJaK2UJzCC06g", "UC_BVJYxQxN5jberGxAFDlyg", "UCRzS1NJFpMLiLbB0vMJXX4w", "UCgwho5LJTUFaZsLmXnt1Mlw", "UC0VR2v4TZeGcOrZHnmwbU_Q", "UCrn5CaT8RoeFGpWJdmO4OwA")),
    TYPE8(8, Arrays.asList("UCFiYPUhUzLKoi-cZ0AwpjLA", "UCPWFxcwPliEBMwJjmeFIDIg", "UCC8bTxyN2ZCfMzS_JAEClfA", "UC-CnwTZJ_A5v-AQK92fNYKw", "UCemFUqq5jad1f258HrPS5rg", "UC0YYag_QxVigWy_VH5hjB0w", "UCdJrAPeZHw72aPBcgCVpv7g", "UCUAKaXyq2hVBCph1LOUtuqg", "UCGGdlC3XCJpRJd12-cqucqw")),
    TYPE9(9, Arrays.asList("UCyn-K7rZLXjGl7VXGweIlcA", "UC0htUSwcxfSGNfK_5Q28JkA", "UCXKEhG9Mcp7VnbhSgzb5sGg", "UCy2WX3w5UyYFHBDHyWFKNUQ", "UCC9pQY_uaBSa0WOpMNJHbEQ", "UCKrhyP3raTJQ38m-US2uMjg", "UCslni4iVQ-e784AU83eVcnQ", "UC37fRkl_iIjDAr9pf0FFzGA", "UCGL-5gylJg3G7T7epVBnhtQ", "UCL3XQXfvshedwa_j-Umx8wg", "UCNB-6ArklP1Mgg11-Og2zMg", "UCZaarGiwxVusY_jQlnftbIA", "UC2IIBYSTMSvJaK2UJzCC06g", "UCcNUpInQt1tI3JC_oTPQ20w", "UCKA_6r3CWC76x_EaFO6jsPA", "UC_BVJYxQxN5jberGxAFDlyg", "UCRzS1NJFpMLiLbB0vMJXX4w", "UCgwho5LJTUFaZsLmXnt1Mlw", "UC0VR2v4TZeGcOrZHnmwbU_Q", "UC4Icothd_W0M7jRzNyAszoA", "UCMXFSqYCTcB4iIJLwUJaBrQ", "UCrn5CaT8RoeFGpWJdmO4OwA", "UC1g9JaEVLOFGhH8hpaK--Jg")),
    TYPE10(10, Arrays.asList("UCFiYPUhUzLKoi-cZ0AwpjLA", "UCPWFxcwPliEBMwJjmeFIDIg", "UCC8bTxyN2ZCfMzS_JAEClfA", "UC-CnwTZJ_A5v-AQK92fNYKw", "UCXKEhG9Mcp7VnbhSgzb5sGg", "UCKrhyP3raTJQ38m-US2uMjg", "UC0YYag_QxVigWy_VH5hjB0w", "UCslni4iVQ-e784AU83eVcnQ", "UC37fRkl_iIjDAr9pf0FFzGA", "UCL3XQXfvshedwa_j-Umx8wg", "UCZaarGiwxVusY_jQlnftbIA", "UCUAKaXyq2hVBCph1LOUtuqg", "UCGGdlC3XCJpRJd12-cqucqw", "UCMXFSqYCTcB4iIJLwUJaBrQ")),
    TYPE11(11, Arrays.asList("UCdJrAPeZHw72aPBcgCVpv7g", "UCKA_6r3CWC76x_EaFO6jsPA", "UC4Icothd_W0M7jRzNyAszoA")),
    TYPE12(12, Arrays.asList("UC0htUSwcxfSGNfK_5Q28JkA", "UCemFUqq5jad1f258HrPS5rg", "UCy2WX3w5UyYFHBDHyWFKNUQ", "UCC9pQY_uaBSa0WOpMNJHbEQ", "UCgwho5LJTUFaZsLmXnt1Mlw", "UC1g9JaEVLOFGhH8hpaK--Jg")),
    TYPE13(13, Arrays.asList("UCyn-K7rZLXjGl7VXGweIlcA", "UCGL-5gylJg3G7T7epVBnhtQ", "UCNB-6ArklP1Mgg11-Og2zMg", "UC2IIBYSTMSvJaK2UJzCC06g", "UCcNUpInQt1tI3JC_oTPQ20w", "UC_BVJYxQxN5jberGxAFDlyg", "UCRzS1NJFpMLiLbB0vMJXX4w", "UC0VR2v4TZeGcOrZHnmwbU_Q", "UCrn5CaT8RoeFGpWJdmO4OwA")),
    TYPE14(14, Arrays.asList("UCFiYPUhUzLKoi-cZ0AwpjLA", "UCPWFxcwPliEBMwJjmeFIDIg", "UCC8bTxyN2ZCfMzS_JAEClfA", "UC-CnwTZJ_A5v-AQK92fNYKw", "UCXKEhG9Mcp7VnbhSgzb5sGg", "UCKrhyP3raTJQ38m-US2uMjg", "UC0YYag_QxVigWy_VH5hjB0w", "UC37fRkl_iIjDAr9pf0FFzGA", "UCL3XQXfvshedwa_j-Umx8wg", "UCdJrAPeZHw72aPBcgCVpv7g", "UCKA_6r3CWC76x_EaFO6jsPA", "UCUAKaXyq2hVBCph1LOUtuqg", "UCGGdlC3XCJpRJd12-cqucqw", "UC4Icothd_W0M7jRzNyAszoA", "UCMXFSqYCTcB4iIJLwUJaBrQ")),
    TYPE15(15, Arrays.asList("UCslni4iVQ-e784AU83eVcnQ", "UCZaarGiwxVusY_jQlnftbIA")),
    TYPE16(16, Arrays.asList("UCemFUqq5jad1f258HrPS5rg", "UCGL-5gylJg3G7T7epVBnhtQ", "UCcNUpInQt1tI3JC_oTPQ20w", "UC1g9JaEVLOFGhH8hpaK--Jg")),
    TYPE17(17, Arrays.asList("UCyn-K7rZLXjGl7VXGweIlcA", "UC0htUSwcxfSGNfK_5Q28JkA", "UCy2WX3w5UyYFHBDHyWFKNUQ", "UCC9pQY_uaBSa0WOpMNJHbEQ", "UCNB-6ArklP1Mgg11-Og2zMg", "UC2IIBYSTMSvJaK2UJzCC06g", "UC_BVJYxQxN5jberGxAFDlyg", "UCRzS1NJFpMLiLbB0vMJXX4w", "UCgwho5LJTUFaZsLmXnt1Mlw", "UC0VR2v4TZeGcOrZHnmwbU_Q", "UCrn5CaT8RoeFGpWJdmO4OwA")),
    TYPE18(18, Arrays.asList("UCFiYPUhUzLKoi-cZ0AwpjLA", "UCPWFxcwPliEBMwJjmeFIDIg", "UCC8bTxyN2ZCfMzS_JAEClfA", "UC-CnwTZJ_A5v-AQK92fNYKw", "UC0YYag_QxVigWy_VH5hjB0w", "UCdJrAPeZHw72aPBcgCVpv7g", "UCUAKaXyq2hVBCph1LOUtuqg", "UCGGdlC3XCJpRJd12-cqucqw")),
    TYPE19(19, Arrays.asList("UCXKEhG9Mcp7VnbhSgzb5sGg", "UCKrhyP3raTJQ38m-US2uMjg", "UCslni4iVQ-e784AU83eVcnQ", "UC37fRkl_iIjDAr9pf0FFzGA", "UCL3XQXfvshedwa_j-Umx8wg", "UCZaarGiwxVusY_jQlnftbIA", "UCKA_6r3CWC76x_EaFO6jsPA", "UC4Icothd_W0M7jRzNyAszoA", "UCMXFSqYCTcB4iIJLwUJaBrQ")),
    TYPE20(20, Arrays.asList("UCemFUqq5jad1f258HrPS5rg")),
    TYPE21(21, Arrays.asList("UCyn-K7rZLXjGl7VXGweIlcA", "UC0htUSwcxfSGNfK_5Q28JkA", "UCy2WX3w5UyYFHBDHyWFKNUQ", "UCC9pQY_uaBSa0WOpMNJHbEQ", "UCGL-5gylJg3G7T7epVBnhtQ", "UCNB-6ArklP1Mgg11-Og2zMg", "UC2IIBYSTMSvJaK2UJzCC06g", "UCcNUpInQt1tI3JC_oTPQ20w", "UC_BVJYxQxN5jberGxAFDlyg", "UCRzS1NJFpMLiLbB0vMJXX4w", "UCgwho5LJTUFaZsLmXnt1Mlw", "UC0VR2v4TZeGcOrZHnmwbU_Q", "UCrn5CaT8RoeFGpWJdmO4OwA", "UC1g9JaEVLOFGhH8hpaK--Jg")),
    TYPE22(22, Arrays.asList("UCFiYPUhUzLKoi-cZ0AwpjLA", "UCPWFxcwPliEBMwJjmeFIDIg", "UCC8bTxyN2ZCfMzS_JAEClfA", "UC-CnwTZJ_A5v-AQK92fNYKw", "UCXKEhG9Mcp7VnbhSgzb5sGg", "UCemFUqq5jad1f258HrPS5rg", "UCKrhyP3raTJQ38m-US2uMjg", "UC0YYag_QxVigWy_VH5hjB0w", "UC37fRkl_iIjDAr9pf0FFzGA", "UCL3XQXfvshedwa_j-Umx8wg", "UCUAKaXyq2hVBCph1LOUtuqg", "UCGGdlC3XCJpRJd12-cqucqw", "UCMXFSqYCTcB4iIJLwUJaBrQ", "UC1g9JaEVLOFGhH8hpaK--Jg")),
    TYPE23(23, Arrays.asList("UC0htUSwcxfSGNfK_5Q28JkA", "UCy2WX3w5UyYFHBDHyWFKNUQ", "UCC9pQY_uaBSa0WOpMNJHbEQ", "UCslni4iVQ-e784AU83eVcnQ", "UCZaarGiwxVusY_jQlnftbIA", "UCgwho5LJTUFaZsLmXnt1Mlw")),
    TYPE24(24, Arrays.asList("UCGL-5gylJg3G7T7epVBnhtQ", "UCdJrAPeZHw72aPBcgCVpv7g", "UCcNUpInQt1tI3JC_oTPQ20w", "UCKA_6r3CWC76x_EaFO6jsPA", "UC4Icothd_W0M7jRzNyAszoA")),
    TYPE25(25, Arrays.asList("UCyn-K7rZLXjGl7VXGweIlcA", "UCNB-6ArklP1Mgg11-Og2zMg", "UC2IIBYSTMSvJaK2UJzCC06g", "UC_BVJYxQxN5jberGxAFDlyg", "UCRzS1NJFpMLiLbB0vMJXX4w", "UC0VR2v4TZeGcOrZHnmwbU_Q", "UCrn5CaT8RoeFGpWJdmO4OwA")),
    TYPE26(26, Arrays.asList("UCFiYPUhUzLKoi-cZ0AwpjLA", "UCPWFxcwPliEBMwJjmeFIDIg", "UCC8bTxyN2ZCfMzS_JAEClfA", "UC-CnwTZJ_A5v-AQK92fNYKw", "UCemFUqq5jad1f258HrPS5rg", "UC0YYag_QxVigWy_VH5hjB0w", "UCUAKaXyq2hVBCph1LOUtuqg", "UCGGdlC3XCJpRJd12-cqucqw")),
    TYPE27(27, Arrays.asList("UC0htUSwcxfSGNfK_5Q28JkA", "UCXKEhG9Mcp7VnbhSgzb5sGg", "UCy2WX3w5UyYFHBDHyWFKNUQ", "UCC9pQY_uaBSa0WOpMNJHbEQ", "UCKrhyP3raTJQ38m-US2uMjg", "UCslni4iVQ-e784AU83eVcnQ", "UC37fRkl_iIjDAr9pf0FFzGA", "UCL3XQXfvshedwa_j-Umx8wg", "UCZaarGiwxVusY_jQlnftbIA", "UCgwho5LJTUFaZsLmXnt1Mlw", "UCMXFSqYCTcB4iIJLwUJaBrQ", "UC1g9JaEVLOFGhH8hpaK--Jg")),
    TYPE28(28, Arrays.asList("UCdJrAPeZHw72aPBcgCVpv7g")),
    TYPE29(29, Arrays.asList("UCyn-K7rZLXjGl7VXGweIlcA", "UCGL-5gylJg3G7T7epVBnhtQ", "UCNB-6ArklP1Mgg11-Og2zMg", "UC2IIBYSTMSvJaK2UJzCC06g", "UCcNUpInQt1tI3JC_oTPQ20w", "UCKA_6r3CWC76x_EaFO6jsPA", "UC_BVJYxQxN5jberGxAFDlyg", "UCRzS1NJFpMLiLbB0vMJXX4w", "UC0VR2v4TZeGcOrZHnmwbU_Q", "UC4Icothd_W0M7jRzNyAszoA", "UCrn5CaT8RoeFGpWJdmO4OwA")),
    TYPE30(30, Arrays.asList("UCFiYPUhUzLKoi-cZ0AwpjLA", "UCPWFxcwPliEBMwJjmeFIDIg", "UCC8bTxyN2ZCfMzS_JAEClfA", "UC-CnwTZJ_A5v-AQK92fNYKw", "UCemFUqq5jad1f258HrPS5rg", "UC0YYag_QxVigWy_VH5hjB0w", "UCdJrAPeZHw72aPBcgCVpv7g", "UCUAKaXyq2hVBCph1LOUtuqg", "UCGGdlC3XCJpRJd12-cqucqw")),
    TYPE31(31, Arrays.asList("UCXKEhG9Mcp7VnbhSgzb5sGg", "UCKrhyP3raTJQ38m-US2uMjg", "UC37fRkl_iIjDAr9pf0FFzGA", "UCGL-5gylJg3G7T7epVBnhtQ", "UCL3XQXfvshedwa_j-Umx8wg", "UCcNUpInQt1tI3JC_oTPQ20w", "UCKA_6r3CWC76x_EaFO6jsPA", "UC4Icothd_W0M7jRzNyAszoA", "UCMXFSqYCTcB4iIJLwUJaBrQ", "UC1g9JaEVLOFGhH8hpaK--Jg")),
    TYPE32(32, Arrays.asList("UCyn-K7rZLXjGl7VXGweIlcA", "UC0htUSwcxfSGNfK_5Q28JkA", "UCy2WX3w5UyYFHBDHyWFKNUQ", "UCC9pQY_uaBSa0WOpMNJHbEQ", "UCslni4iVQ-e784AU83eVcnQ", "UCNB-6ArklP1Mgg11-Og2zMg", "UCZaarGiwxVusY_jQlnftbIA", "UC2IIBYSTMSvJaK2UJzCC06g", "UC_BVJYxQxN5jberGxAFDlyg", "UCRzS1NJFpMLiLbB0vMJXX4w", "UCgwho5LJTUFaZsLmXnt1Mlw", "UC0VR2v4TZeGcOrZHnmwbU_Q", "UCrn5CaT8RoeFGpWJdmO4OwA")),
    TYPE33(33, Arrays.asList("UCFiYPUhUzLKoi-cZ0AwpjLA", "UCPWFxcwPliEBMwJjmeFIDIg", "UCC8bTxyN2ZCfMzS_JAEClfA", "UC-CnwTZJ_A5v-AQK92fNYKw", "UCXKEhG9Mcp7VnbhSgzb5sGg", "UCKrhyP3raTJQ38m-US2uMjg", "UC0YYag_QxVigWy_VH5hjB0w", "UC37fRkl_iIjDAr9pf0FFzGA", "UCL3XQXfvshedwa_j-Umx8wg", "UCUAKaXyq2hVBCph1LOUtuqg", "UCGGdlC3XCJpRJd12-cqucqw", "UCMXFSqYCTcB4iIJLwUJaBrQ")),
    TYPE34(34, Arrays.asList("UCslni4iVQ-e784AU83eVcnQ", "UCZaarGiwxVusY_jQlnftbIA")),
    TYPE35(35, Arrays.asList("UCdJrAPeZHw72aPBcgCVpv7g", "UCKA_6r3CWC76x_EaFO6jsPA", "UC4Icothd_W0M7jRzNyAszoA")),
    TYPE36(36, Arrays.asList("UCemFUqq5jad1f258HrPS5rg", "UC1g9JaEVLOFGhH8hpaK--Jg")),
    TYPE37(37, Arrays.asList("UC0htUSwcxfSGNfK_5Q28JkA", "UCy2WX3w5UyYFHBDHyWFKNUQ", "UCC9pQY_uaBSa0WOpMNJHbEQ", "UCgwho5LJTUFaZsLmXnt1Mlw")),
    TYPE38(38, Arrays.asList("UCGL-5gylJg3G7T7epVBnhtQ", "UCcNUpInQt1tI3JC_oTPQ20w")),
    TYPE39(39, Arrays.asList("UCyn-K7rZLXjGl7VXGweIlcA", "UCNB-6ArklP1Mgg11-Og2zMg", "UC2IIBYSTMSvJaK2UJzCC06g", "UC_BVJYxQxN5jberGxAFDlyg", "UCRzS1NJFpMLiLbB0vMJXX4w", "UC0VR2v4TZeGcOrZHnmwbU_Q", "UCrn5CaT8RoeFGpWJdmO4OwA")),
    TYPE40(40, Arrays.asList("UCFiYPUhUzLKoi-cZ0AwpjLA", "UCPWFxcwPliEBMwJjmeFIDIg", "UCC8bTxyN2ZCfMzS_JAEClfA", "UC-CnwTZJ_A5v-AQK92fNYKw", "UC0YYag_QxVigWy_VH5hjB0w", "UCUAKaXyq2hVBCph1LOUtuqg", "UCGGdlC3XCJpRJd12-cqucqw")),
    TYPE41(41, Arrays.asList("UCXKEhG9Mcp7VnbhSgzb5sGg", "UCKrhyP3raTJQ38m-US2uMjg", "UCslni4iVQ-e784AU83eVcnQ", "UC37fRkl_iIjDAr9pf0FFzGA", "UCL3XQXfvshedwa_j-Umx8wg", "UCZaarGiwxVusY_jQlnftbIA", "UCMXFSqYCTcB4iIJLwUJaBrQ")),
    TYPE42(42, Arrays.asList("UCdJrAPeZHw72aPBcgCVpv7g")),
    TYPE43(43, Arrays.asList("UCKA_6r3CWC76x_EaFO6jsPA", "UC4Icothd_W0M7jRzNyAszoA")),
    TYPE44(44, Arrays.asList("UCemFUqq5jad1f258HrPS5rg")),
    TYPE45(45, Arrays.asList("UC0htUSwcxfSGNfK_5Q28JkA", "UCy2WX3w5UyYFHBDHyWFKNUQ", "UCC9pQY_uaBSa0WOpMNJHbEQ", "UCgwho5LJTUFaZsLmXnt1Mlw", "UC1g9JaEVLOFGhH8hpaK--Jg")),
    TYPE46(46, Arrays.asList("UCyn-K7rZLXjGl7VXGweIlcA", "UCGL-5gylJg3G7T7epVBnhtQ", "UCNB-6ArklP1Mgg11-Og2zMg", "UC2IIBYSTMSvJaK2UJzCC06g", "UCcNUpInQt1tI3JC_oTPQ20w", "UC_BVJYxQxN5jberGxAFDlyg", "UCRzS1NJFpMLiLbB0vMJXX4w", "UC0VR2v4TZeGcOrZHnmwbU_Q", "UCrn5CaT8RoeFGpWJdmO4OwA")),
    TYPE47(47, Arrays.asList("UCFiYPUhUzLKoi-cZ0AwpjLA", "UCPWFxcwPliEBMwJjmeFIDIg", "UCC8bTxyN2ZCfMzS_JAEClfA", "UC-CnwTZJ_A5v-AQK92fNYKw", "UC0YYag_QxVigWy_VH5hjB0w", "UCdJrAPeZHw72aPBcgCVpv7g", "UCUAKaXyq2hVBCph1LOUtuqg", "UCGGdlC3XCJpRJd12-cqucqw")),
    TYPE48(48, Arrays.asList("UCXKEhG9Mcp7VnbhSgzb5sGg", "UCKrhyP3raTJQ38m-US2uMjg", "UC37fRkl_iIjDAr9pf0FFzGA", "UCL3XQXfvshedwa_j-Umx8wg", "UCKA_6r3CWC76x_EaFO6jsPA", "UC4Icothd_W0M7jRzNyAszoA", "UCMXFSqYCTcB4iIJLwUJaBrQ")),
    TYPE49(49, Arrays.asList("UCslni4iVQ-e784AU83eVcnQ", "UCZaarGiwxVusY_jQlnftbIA")),
    TYPE50(50, Arrays.asList("UCemFUqq5jad1f258HrPS5rg")),
    TYPE51(51, Arrays.asList("UCGL-5gylJg3G7T7epVBnhtQ", "UCcNUpInQt1tI3JC_oTPQ20w", "UC1g9JaEVLOFGhH8hpaK--Jg")),
    TYPE52(52, Arrays.asList("UCyn-K7rZLXjGl7VXGweIlcA", "UC0htUSwcxfSGNfK_5Q28JkA", "UCy2WX3w5UyYFHBDHyWFKNUQ", "UCC9pQY_uaBSa0WOpMNJHbEQ", "UCNB-6ArklP1Mgg11-Og2zMg", "UC2IIBYSTMSvJaK2UJzCC06g", "UC_BVJYxQxN5jberGxAFDlyg", "UCRzS1NJFpMLiLbB0vMJXX4w", "UCgwho5LJTUFaZsLmXnt1Mlw", "UC0VR2v4TZeGcOrZHnmwbU_Q", "UCrn5CaT8RoeFGpWJdmO4OwA")),
    TYPE53(53, Arrays.asList("UCFiYPUhUzLKoi-cZ0AwpjLA", "UCPWFxcwPliEBMwJjmeFIDIg", "UCC8bTxyN2ZCfMzS_JAEClfA", "UC-CnwTZJ_A5v-AQK92fNYKw", "UCemFUqq5jad1f258HrPS5rg", "UC0YYag_QxVigWy_VH5hjB0w", "UCUAKaXyq2hVBCph1LOUtuqg", "UCGGdlC3XCJpRJd12-cqucqw")),
    TYPE54(54, Arrays.asList("UCXKEhG9Mcp7VnbhSgzb5sGg", "UCKrhyP3raTJQ38m-US2uMjg", "UC37fRkl_iIjDAr9pf0FFzGA", "UCL3XQXfvshedwa_j-Umx8wg", "UCMXFSqYCTcB4iIJLwUJaBrQ", "UC1g9JaEVLOFGhH8hpaK--Jg")),
    TYPE55(55, Arrays.asList("UC0htUSwcxfSGNfK_5Q28JkA", "UCy2WX3w5UyYFHBDHyWFKNUQ", "UCC9pQY_uaBSa0WOpMNJHbEQ", "UCslni4iVQ-e784AU83eVcnQ", "UCZaarGiwxVusY_jQlnftbIA", "UCgwho5LJTUFaZsLmXnt1Mlw")),
    TYPE56(56, Arrays.asList("UCdJrAPeZHw72aPBcgCVpv7g")),
    TYPE57(57, Arrays.asList("UCGL-5gylJg3G7T7epVBnhtQ", "UCcNUpInQt1tI3JC_oTPQ20w", "UCKA_6r3CWC76x_EaFO6jsPA", "UC4Icothd_W0M7jRzNyAszoA")),
    TYPE58(58, Arrays.asList("UCyn-K7rZLXjGl7VXGweIlcA", "UCNB-6ArklP1Mgg11-Og2zMg", "UC2IIBYSTMSvJaK2UJzCC06g", "UC_BVJYxQxN5jberGxAFDlyg", "UCRzS1NJFpMLiLbB0vMJXX4w", "UC0VR2v4TZeGcOrZHnmwbU_Q", "UCrn5CaT8RoeFGpWJdmO4OwA")),
    TYPE59(59, Arrays.asList("UCFiYPUhUzLKoi-cZ0AwpjLA", "UCPWFxcwPliEBMwJjmeFIDIg", "UCC8bTxyN2ZCfMzS_JAEClfA", "UC-CnwTZJ_A5v-AQK92fNYKw", "UC0YYag_QxVigWy_VH5hjB0w", "UCUAKaXyq2hVBCph1LOUtuqg", "UCGGdlC3XCJpRJd12-cqucqw")),
    TYPE60(60, Arrays.asList("UCXKEhG9Mcp7VnbhSgzb5sGg", "UCKrhyP3raTJQ38m-US2uMjg", "UC37fRkl_iIjDAr9pf0FFzGA", "UCL3XQXfvshedwa_j-Umx8wg", "UCMXFSqYCTcB4iIJLwUJaBrQ")),
    TYPE61(61, Arrays.asList("UCslni4iVQ-e784AU83eVcnQ", "UCZaarGiwxVusY_jQlnftbIA")),
    TYPE62(62, Arrays.asList("UCdJrAPeZHw72aPBcgCVpv7g")),
    TYPE63(63, Arrays.asList("UCKA_6r3CWC76x_EaFO6jsPA", "UC4Icothd_W0M7jRzNyAszoA")),
    TYPE64(64, Arrays.asList("UCemFUqq5jad1f258HrPS5rg")),
    TYPE65(65, Arrays.asList("UC1g9JaEVLOFGhH8hpaK--Jg")),
    TYPE66(66, Arrays.asList("UC0htUSwcxfSGNfK_5Q28JkA", "UCy2WX3w5UyYFHBDHyWFKNUQ", "UCC9pQY_uaBSa0WOpMNJHbEQ", "UCgwho5LJTUFaZsLmXnt1Mlw")),
    TYPE67(67, Arrays.asList("UCGL-5gylJg3G7T7epVBnhtQ", "UCcNUpInQt1tI3JC_oTPQ20w")),
    TYPE68(68, Arrays.asList("UCyn-K7rZLXjGl7VXGweIlcA", "UCNB-6ArklP1Mgg11-Og2zMg", "UC2IIBYSTMSvJaK2UJzCC06g", "UC_BVJYxQxN5jberGxAFDlyg", "UCRzS1NJFpMLiLbB0vMJXX4w", "UC0VR2v4TZeGcOrZHnmwbU_Q", "UCrn5CaT8RoeFGpWJdmO4OwA"));

    private final Integer typeNumber;
    private final List<String> creatorIdList;

    public static List<String> findCreatorIdListByTypeNumber(Integer typeNumber) {
        for (CreatorType creatorType : values()) {
            if (creatorType.getTypeNumber().equals(typeNumber)) {
                return creatorType.getCreatorIdList();
            }
        }
        return Collections.emptyList();
    }
}
