Feature: AdminArea DashboardPageTests

  Once Logged in ,to the Admin Dashboard Page (admin-home),
  click on everything clickable and make sure everything works
  as intended.

  Scenario: Total Orders Redirect
    Given the Admin is on the Admin Dashboard Page (admin-home)
    When he clicks the <View More> link on the <Total Orders> field
    Then ensure he is redirected to the <Orders> page a.e. <Orders> header is visible


  Scenario: Total Sales Redirect
    Given the Admin is on the Admin Dashboard Page (admin-home)
    When he clicks the <View More> link on the <Total Sales> field
    Then ensure he is redirected to the <Orders> page a.e. <Orders> header is visible


  Scenario: Total Customers Redirect
    Given the Admin is on the Admin Dashboard Page (admin-home)
    When he clicks the <View More> link on the <Total Customers> field
    Then ensure he is redirected to the <Customers> page a.e. <Customers> header is visible
