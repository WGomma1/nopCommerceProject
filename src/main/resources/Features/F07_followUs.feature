@smoke
  Feature: Confirm ''follow us ' links open the corresponding websites
    Scenario:confirm facebook link is open successfully
      When user click on facebook icon
      Then non commerce facebook page open

    Scenario:confirm Twitter link is open successfully
      When user click on Twitter icon
      Then non commerce Twitter page open

    Scenario:confirm rss link is open successfully
      When user click on rss icon
      Then non commerce rss page open

    Scenario:confirm youtube link is open successfully
      When user click on youtube icon
      Then non commerce youtube page open

