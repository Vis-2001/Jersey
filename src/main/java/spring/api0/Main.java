package spring.api0;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/login/txt")
public class Main {

    @GET
    @Path("/computeCost")
    @Produces(MediaType.TEXT_PLAIN)
    public String computeCost(@PathParam("quantity") String quantity,
                              @PathParam("bloodGroup") String bloodGroup,
                              @PathParam("userType") String userType) {

        // Convert quantity to packets (each packet is 100ml)
        int quantityInMl = Integer.parseInt(quantity);
        int packets = (int) Math.ceil(quantityInMl / 100.0);

        // Base price per 100ml
        double basePrice = 200.0;
        double costPerPacket;

        // Calculate cost per packet based on blood group
        switch (bloodGroup) {
            case "O+":
            case "O-":
                costPerPacket = basePrice;
                break;
            case "B+":
            case "B-":
                costPerPacket = basePrice * 1.05; // 5% more than base price
                break;
            case "A+":
            case "A-":
                costPerPacket = basePrice * 1.08; // 8% more than base price
                break;
            case "AB+":
            case "AB-":
                costPerPacket = basePrice * 1.10; // 10% more than base price
                break;
            default:
                return "Invalid blood group!";
        }

        // Calculate total cost
        double totalCost = costPerPacket * packets;

        // Apply discount if user type is Hospital
        if ("H".equalsIgnoreCase(userType)) {
            totalCost *= 0.90; // 10% discount
        } else if (!"I".equalsIgnoreCase(userType)) {
            return "Invalid user type!";
        }

        return String.format("Total Cost: Rs %.2f", totalCost);
    }
}

