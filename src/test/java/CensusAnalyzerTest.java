import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyzerTest {
    private static final String INDIA_CENSUS_CSV_PATH = "F:\\indian-state-census-analyzer\\src\\main\\resources\\IndiaStateCensusData.csv";

    @Test
    public void givenIndianCensusCSVFileReturnsCorrectRecords() {
        CensusAnalyzer censusAnalyzer = new CensusAnalyzer();

        try {
            int numOfRecord = censusAnalyzer.loadIndiaCensusData(INDIA_CENSUS_CSV_PATH);
            Assert.assertEquals(29, numOfRecord);

        } catch (CensusAnalyzerException e) {
            e.printStackTrace();
        }
    }
}