package com.example.spring_with_kotlin.application.command

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class ScheduleFlightCommand(@TargetAggregateIdentifier val id: String /*, other state */)

//A Command targeting specific Command Handling Component
//data class ScheduleFlightCommand(@RoutingKey val id: String /*, other state */)
