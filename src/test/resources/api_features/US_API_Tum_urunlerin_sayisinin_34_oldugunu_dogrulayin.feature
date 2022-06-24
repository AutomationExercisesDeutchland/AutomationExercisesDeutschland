Feature: US_API_Tum_urunlerin_sayisinin_34_oldugunu_dogrulayin

  Scenario:
    Given kullanici "productsList" endpointine request gonderir
    Then kullanici status kodunun 200 oldugunu dogrular
    And kullanici urun sayisinin 34 oldugunu dogrular
    And kullanici fiyati 1000'den kucuk olan urunleri log.txt dosyasina yazdirir